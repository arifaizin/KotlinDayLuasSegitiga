package id.hamasah.kotlindayluassegitiga

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import id.hamasah.kotlindaymvp.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    //deklarasi presenter
    lateinit var presenter: MainPresenterImp
    // late init --> gantinya = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()

        btnHitung.setOnClickListener {
            presenter.hitungLuas(ed_alas, ed_tinggi)
        }

    }

    private fun initPresenter() {
        presenter = MainPresenterImp(this);
    }

    override fun kosong() {
        Toast.makeText(this, "Kosong", Toast.LENGTH_SHORT
        )
    }

    override fun hasil(nilai: String) {
        texthasil.text = nilai
    }
}
