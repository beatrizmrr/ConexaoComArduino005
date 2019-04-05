package com.designinteracao.conexaocomarduino001

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.util.Log
import android.view.View
import android.widget.Toast
import com.designinteracao.conexaocomarduino001.SelecionarDispositivo.Companion.HC05_UUID
import com.designinteracao.conexaocomarduino001.SelecionarDispositivo.Companion.mBluetoothAdapter
import com.designinteracao.conexaocomarduino001.SelecionarDispositivo.Companion.mDevice
import kotlinx.android.synthetic.main.activity_aplcacao_arduino.*
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.nio.charset.Charset
import java.util.*
import android.system.Os.socket
import com.example.projetinho2.BlankFragment2
import com.example.projetinho2.Home
import com.example.projetinho2.Notificacoes
import java.lang.Exception


class AplcacaoArduino : AppCompatActivity() {
    lateinit var comunicacaoBT:ComunicacaoBluetooth

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.navigation_home -> {
//                println("Home pressed")
////                replaceFragment(Home())
//
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_dashboard -> {
//                println("123")
//                replaceFragment(BlankFragment2())
//                //message.setText(R.string.title_dashboard)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_notifications -> {
//                println("456")
//                //message.setText(R.string.title_notifications)
//                replaceFragment(Notificacoes())
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplcacao_arduino)

        try {
            //verifica se o fragmento já existe
            comunicacaoBT =    supportFragmentManager
                .findFragmentByTag("comunicacao_BT") as ComunicacaoBluetooth
        }catch (e:Exception)
        {
            //cria o fragment caso ele não exista
            comunicacaoBT = ComunicacaoBluetooth();
            supportFragmentManager.beginTransaction()
                .add(comunicacaoBT, "comunicacao_BT").commit();
        }

        comunicacaoBT.SetTxtReceber(txtReceber)





          }}

//private fun replaceFragment(fragment: Fragment){
//    val fragmentTransaction = supportFragmentManager.beginTransaction()
//    fragmentTransaction.replace(R.id.fragmentContainer,fragment)
//
//    fragmentTransaction.commit()
//}

    //override fun onDestroy() {
     // super.onDestroy()
  //  }


   // override fun onBackPressed() {
      //roda as finalizações necessárias, como fechar o socket de comunicação com o bluetooth
    //  comunicacaoBT.destruir()
    //  supportFragmentManager.beginTransaction().remove(comunicacaoBT).commitAllowingStateLoss();
     // finish()
   // }

/* fun btnLigarClick(view: View)
{
  val ch = 'L'
  val bt = ch.toByte()
  mConnectedThread!!.write(bt)
}
fun btnDesligarClick(view: View)
{
  val ch = 'D'
  val bt = ch.toByte()
  mConnectedThread!!.write(bt)
}
fun btnPiscarClick(view: View)
{
  val ch = 'P'
  val bt = ch.toByte()
  mConnectedThread!!.write(bt)
}
fun btnLerDadosClick(view: View)
{
  val ch = 'Z'
  val bt = ch.toByte()
  mConnectedThread!!.write(bt)
}*/



