package id.hamasah.kotlindayluassegitiga

import android.widget.EditText
import id.hamasah.kotlindaymvp.MainView

/**
 * Created by idn on 2/17/2018.
 */
class MainPresenterImp {
    var mainView : MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    fun hitungLuas (input1 : EditText, input2 : EditText) {
        if (input1.text.toString().isEmpty() || input2.text.toString().isEmpty()){
            mainView?.kosong()
        }

        var alas = input1.text.toString().toDouble()
        var tinggi = input2.text.toString().toDouble()

        var hasil = alas * tinggi / 2

        mainView?.hasil(hasil.toString())
    }
}