package com.example.gra_w_kosci
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


public var wynik_gry = 0;
public var wynik_losowania = 0;

lateinit var rzut: Button;
lateinit var reset: Button;

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

        kostka1 = findViewById(R.id.imageView14)
        kostka2 = findViewById(R.id.imageView15)
        kostka3 = findViewById(R.id.imageView16)
        kostka4 = findViewById(R.id.imageView17)
        kostka5 = findViewById(R.id.imageView18)

    }




}

fun losowanie(view: View?)
{
    val num_array: Array<Int?> = arrayOfNulls(5)
    var array_of_images: Array<ImageView?> = arrayOfNulls(5)
    array_of_images.set(0, kostka1)
    array_of_images.set(1, kostka2)
    array_of_images.set(2, kostka3)
    array_of_images.set(3, kostka4)
    array_of_images.set(4, kostka5)

    for(x in 1..5)
    {
        num_array.set(x, (1..5).random())
    }


    for (x in 1..5)
    {
        var random_number =  (0..5).random()
        num_array.set(x, random_number)
        wynik_gry = random_number
    }

    for(x in 1..5)
    {
        if(x == 1)
        array_of_images.get(x).setImageDrawable()
    }




}