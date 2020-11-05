package com.example.intents

import android.content.Intent
import android.location.Geocoder
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_browser).setOnClickListener {webBrowser()}
        findViewById<Button>(R.id.btn_photo_camera).setOnClickListener {openCameraPhoto()}
        findViewById<Button>(R.id.btn_video_camera).setOnClickListener {openCameraVideo()}
        findViewById<Button>(R.id.btn_gallery).setOnClickListener {openGallery()}
        findViewById<Button>(R.id.btn_map).setOnClickListener {openMap()}

    }

    private fun webBrowser(){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com/")
        startActivity(intent)
    }

    private fun openCameraPhoto(){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }

    private fun openMap(){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("geo:16.41302, 120.59076(Baguio)")
        startActivity(intent)
    }
    //The intent failed due to the condition in which the intent must be null in order to start
    private fun openCameraVideo(){
        Toast.makeText(this, "The intent failed to start", Toast.LENGTH_SHORT).show()
        val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        if(intent == null) {
            startActivity(intent)
        }
    }
    //The intent failed due to missing line of code which is startActivity(intent)
    private fun openGallery(){
        Toast.makeText(this, "The intent failed to start", Toast.LENGTH_SHORT).show()
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("content://media/external/images/media/")
    }



}