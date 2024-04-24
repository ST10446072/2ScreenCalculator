package com.ST10446072.imadcalculator2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisplay : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisplay = findViewById(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnRoot = findViewById<Button>(R.id.btnRoot)
        btnRoot.setOnClickListener{sqr()}

        val btnPower = findViewById<Button>(R.id.btnPower)
        btnPower.setOnClickListener{pow()}

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener{
            // call the next screen
            val intent = Intent( this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }


    }

    private fun add(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum1.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2
        tvDisplay?.text = intAnswer.toString()
        }

    private fun sub(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum1.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2
        tvDisplay?.text = intAnswer.toString()
    }

    private fun mul(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum1.toInt()
        var intAnswer = 0

        intAnswer = intNum1 * intNum2
        tvDisplay?.text = intAnswer.toString()
    }

    private fun div() {
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum1.toInt()
        var fltAnswer = 0

        if (intNum2 == 0) {
            tvDisplay?.text = "Division by zero is not allowed"
    } else {
        fltAnswer = intNum1 / intNum2
    }

        tvDisplay?.text = fltAnswer.toString()

    }

    private fun sqr(){
        val strNum1 = etNum1?.text?.toString()
        //val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty()){                      //strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        //val intNum2 = strNum1.toInt()
        var fltAnswer = 1

        fltAnswer = sqrt(intNum1.toDouble()).toInt()
        tvDisplay?.text = fltAnswer.toString()
    }

    private fun pow(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty()|| strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 1

        for (i in 1..intNum2)
            intAnswer *= intNum1
        /*var intAnswer : Int = 1

        for (i in 1..intNum2!!) {
                intAnswer = intAnswer * intNum1
        } */
        tvDisplay?.text = intAnswer.toString()
    }
}