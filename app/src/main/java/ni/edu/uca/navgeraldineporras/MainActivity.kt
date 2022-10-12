package ni.edu.uca.navgeraldineporras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.navgeraldineporras.databinding.ActivityMainBinding


//EJERCICIO 2

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val usuario:String = "UCA"
    val pw:String = "Nicaragua"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciar()
    }



    private fun iniciar() {
        binding.btnLogin.setOnClickListener {
            val user = binding.etName.text.toString()
            val pw = binding.etPass.text.toString()
        }
    }


}
