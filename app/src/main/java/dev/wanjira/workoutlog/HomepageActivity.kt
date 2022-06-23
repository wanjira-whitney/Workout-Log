package dev.wanjira.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomepageActivity : AppCompatActivity() {
    lateinit var bnvHome: BottomNavigationView
    lateinit var fcvHome: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        castViews()
        setupBottomNav()
    }

    fun
            castViews() {
        bnvHome = findViewById(R.id.bottomNavigation)
        fcvHome = findViewById(R.id.fcvHome)
    }

    fun setupBottomNav() {
        bnvHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Plan -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, PlanFragment())
                        .commit()
                    true
                }
                R.id.Plan -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, PlanFragment())
                        .commit()
                    true
                }
                R.id.Track -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment())
                        .commit()
                    true
                }
                R.id.Profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ProfileFragment())
                        .commit()
                    true
                }
                else -> false

            }
        }
    }
}