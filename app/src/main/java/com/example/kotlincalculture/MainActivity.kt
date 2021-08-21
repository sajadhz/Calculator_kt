package com.example.kotlincalculture

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    //Intilizing
    var editText:EditText? = null
    var firstInput:String? = null
    var opration:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editTextNumber)
    }

    @SuppressLint("SetTextI18n")
    //Function onClick for buttons
    fun onClicked(v:View){
    val btn = v as Button
        //get Buttons tag
        when (btn.tag.toString()){
        //Apply numbers with their tag
            "0","1","2","3","4","5","6","7","8","9","."->{
                var content:String = editText?.text.toString()
                //Set Text with buttons tag
                editText?.setText(content+btn.tag.toString())
            }
        //Apply operations
         "+"->{
             opration = "+"
             firstInput = editText?.text.toString()
             editText?.setText("")
         }
         "-"->{
             opration = "-"
             firstInput = editText?.text.toString()
             editText?.setText("")
         }
         "*"->{
             opration = "*"
             firstInput = editText?.text.toString()
             editText?.setText("")
         }
         "%"-> {
             opration = "%"
             firstInput = editText?.text.toString()
             editText?.setText("")

         }
        //when press = do + - * / and return
        "="->{
            if (opration.equals("+")){
                var input = firstInput?.toDouble()
                var secondInput = (editText?.text.toString()).toDouble()
                var result = input?.plus(secondInput)
                editText?.setText(result.toString())
            }
            if(opration.equals("-")){
                var input = firstInput?.toDouble()
                var secondInput = (editText?.text.toString()).toDouble()
                var result = input?.minus(secondInput)
                editText?.setText(result.toString())
            }
            if(opration.equals("*")){
                var input = firstInput?.toDouble()
                var secondInput = (editText?.text.toString()).toDouble()
                var result = input?.times(secondInput)
                editText?.setText(result.toString())
            }
            if(opration.equals("%")){
                var input = firstInput?.toDouble()
                var secondInput = (editText?.text.toString()).toDouble()
                var result = input?.div(secondInput)
                editText?.setText(result.toString())
            }
        }
            //Clear text
            "C"->{
                editText?.setText(null)
            }
        }
    }

}




