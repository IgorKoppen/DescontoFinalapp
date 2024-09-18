package com.github.igorkoppen.descontofinalapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.github.igorkoppen.descontofinalapp.databinding.ActivityMainBinding
import com.github.igorkoppen.descontofinalapp.databinding.CustomBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpListeners()
    }
    private fun setUpListeners() {
        binding.buttonCalculate.setOnClickListener {
            val price = binding.editTextPrice.text.toString().toDoubleOrNull()
            val discountPercent = binding.editTextDiscount.text.toString().toDoubleOrNull()
            if (price != null && discountPercent != null) {
                viewModel.calculateDiscount(price, discountPercent)
                showBottomSheet()
            } else {
                showRequiredFieldsAlert()
            }
        }
        binding.buttonClear .setOnClickListener {
            binding.editTextPrice .text.clear()
            binding.editTextDiscount .text.clear()
            viewModel.clearData()
        }
    }
    private fun showRequiredFieldsAlert () {
        Snackbar.make(binding.main, getString( R.string.label_ok),
            Snackbar.LENGTH_SHORT).show()
    }

    private fun showBottomSheet () {
        val bottomSheetDialog = BottomSheetDialog( this)
        val binding = CustomBottomSheetBinding.inflate(layoutInflater)
        val view = binding.root
        viewModel.discountValue .observe(this) { discountValue ->
            binding.textViewDiscountValue .text =
                getString(R.string.discount_value, "%.2f".format(discountValue))
        }
        viewModel.totalPrice.observe(this) { totalPrice ->
            binding.textViewTotalPrice .text =
                getString(R.string.price_with_discount, "%.2f".format(totalPrice))
        }
        binding.buttonClose .setOnClickListener {
            bottomSheetDialog .dismiss()
        }
        binding.lottieAnimationViewResult .setAnimation( R.raw.success_animation
        )
        binding.lottieAnimationViewResult .playAnimation()
        bottomSheetDialog .setContentView( view)
        bottomSheetDialog .show()
    }
}
