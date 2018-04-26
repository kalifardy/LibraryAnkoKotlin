package com.keyalive.kotlin.ankokotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.keyalive.kotlin.ankokotlin.R.attr.height
import com.keyalive.kotlin.ankokotlin.R.id.text
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        LayoutTanpa_xml().setContentView(this)
    }
}

class LayoutTanpa_xml:AnkoComponent<MainActivity2> {
    override fun createView(ui: AnkoContext<MainActivity2>) = with(ui) {
        verticalLayout {

            textView {
                text = "Kalkulator sederhana"
                textColor = Color.BLACK
                textSize = 16f
                gravity = Gravity.CENTER
            }

            var input1 = editText {

                hint = "Angka Pertama"
            }.lparams {
                topMargin = 10
                width = matchParent
                height = wrapContent
            }

            var input2 = editText {
                hint = "Anga Kedua"
            }

            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                button {
                    text = "Kali"
                    width = matchParent
                    height = wrapContent
                    onClick {
                        //konvert nilai inputan 1
                        var convert1 = input1.text.toString().toDouble()
                        var convert2 = input2.text.toString().toDouble()

                        var hasil = convert1 * convert2
                        toast(hasil.toString())


                    }
                }.lparams {
                    weight = 1F
                }
                button {
                    text = "Tambah"
                    width = matchParent
                    height = wrapContent
                    onClick {
                        //konvert nilai inputan 1
                        var convert1 = input1.text.toString().toDouble()
                        var convert2 = input2.text.toString().toDouble()

                        var hasil = convert1 + convert2
                        toast(hasil.toString())


                    }
                }.lparams {
                    weight = 1F

                }


            }
        }
    }
}



