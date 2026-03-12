package com.example.gra_w_kosci
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


public var wynik_gry = 0;
public var wynik_losowania = 0;

lateinit var rzut: Button;
lateinit var reset: Button;
lateinit var wynik: TextView;
lateinit var kostka1: ImageView;
lateinit var kostka2: ImageView;
lateinit var kostka3: ImageView;
lateinit var kostka4: ImageView;
lateinit var kostka5: ImageView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        rzut = findViewById(R.id.rzut)
        reset = findViewById(R.id.reset)
        wynik = findViewById(R.id.wynik_losowania)
        wynik_gry = findViewById(R.id.wynik_gry)
        kostka1 = findViewById(R.id.imageView14)
        kostka2 = findViewById(R.id.imageView15)
        kostka3 = findViewById(R.id.imageView16)
        kostka4 = findViewById(R.id.imageView17)
        kostka5 = findViewById(R.id.imageView18)

    }




}



fun losowanie(view: View?) {

    val num_array: Array<Int?> = arrayOfNulls(5)
    val array_of_images: Array<ImageView?> = arrayOfNulls(5)

    array_of_images[0] = kostka1
    array_of_images[1] = kostka2
    array_of_images[2] = kostka3
    array_of_images[3] = kostka4
    array_of_images[4] = kostka5


    wynik_losowania = 0

    for (x in 0..4) {

        val random_number = (1..6).random()
        num_array[x] = random_number

        wynik_gry += random_number

        when(random_number) {
            1 -> array_of_images[x]?.setImageResource(R.drawable.k1)
            2 -> array_of_images[x]?.setImageResource(R.drawable.k2)
            3 -> array_of_images[x]?.setImageResource(R.drawable.k3)
            4 -> array_of_images[x]?.setImageResource(R.drawable.k4)
            5 -> array_of_images[x]?.setImageResource(R.drawable.k5)
            6 -> array_of_images[x]?.setImageResource(R.drawable.k6)
        }
    }

    wynik.text = "Wynik"
}

fun reset(view: View?) {
    wynik_gry = 0

}



}