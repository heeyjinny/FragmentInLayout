package com.heeyjinny.fragmentinlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.heeyjinny.fragmentinlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //뷰바인딩
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩
        setContentView(binding.root)

        //프래그먼트 생성
        //java디렉터리 밑 패키지명 우클릭 - New - Fragment - Fragment(Blank)
        //ListFragment.kt 생성

    }//onCreate

}//MainActivity