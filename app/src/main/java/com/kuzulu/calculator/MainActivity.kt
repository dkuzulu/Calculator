package com.kuzulu.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonNumberEvent(view: View) {
        if (isNewOp){
            etShowNumber.setText("")
        }
        isNewOp=false

        val buttonSelect = view as Button
        var buttonClickValue: String = etShowNumber.text.toString()
        when (buttonSelect.id) {
            button0.id -> {
                buttonClickValue += "0"
            }
            button1.id -> {
                buttonClickValue += "1"
            }
            button2.id -> {
                buttonClickValue += "2"
            }
            button3.id -> {
                buttonClickValue += "3"
            }
            button4.id -> {
                buttonClickValue += "4"
            }
            button5.id -> {
                buttonClickValue += "5"
            }
            button6.id -> {
                buttonClickValue += "6"
            }
            button7.id -> {
                buttonClickValue += "7"
            }
            button8.id -> {
                buttonClickValue += "8"
            }
            button9.id -> {
                buttonClickValue += "9"
            }
            buttonvirgule.id -> {
                buttonClickValue += "."
            }
            buttonplusoumoins.id -> {
                buttonClickValue = "-" + buttonClickValue
            }


        }
        etShowNumber.setText(buttonClickValue)
    }
var op ="*"
var oldNumber=""
var isNewOp=true
    fun buttonOperationEvent(view: View) {

        val buttonSelect= view as Button
        when (buttonSelect.id) {
            buttonmultiplication.id -> {

                op ="*"

            }
            buttondivision.id -> {

                op="/"

            }
            buttonsoustraction.id -> {

                op="-"

            }
            buttonaddition.id -> {

                op="+"

            }
        }
        oldNumber=etShowNumber.text.toString()
        isNewOp=true

    }

    fun buttonEqualEvent(view: View){
        val newNumber=etShowNumber.text.toString()
        var finalNumber:Double?=null
        when(op){
            "*"->{

                finalNumber=oldNumber.toDouble()*newNumber.toDouble()

            }
            "/"->{
                finalNumber=oldNumber.toDouble()/newNumber.toDouble()

            }
            "-"->{
                finalNumber=oldNumber.toDouble()-newNumber.toDouble()

            }
            "+"->{
                finalNumber=oldNumber.toDouble()+newNumber.toDouble()

            }
        }
        etShowNumber.setText(finalNumber.toString())
        isNewOp=true
    }

    fun buttonPercent(view: View){
        val number:Double=etShowNumber.text.toString().toDouble()/100

        etShowNumber.setText(number.toString())
    }

    fun buttonClean(view: View){
        etShowNumber.setText("0")
        isNewOp=true
    }

}
