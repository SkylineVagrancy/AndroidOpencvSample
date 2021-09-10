package com.zjp.androidopencv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zjp.androidopencv.cameracalibration.CameraCalibrationActivity;
import com.zjp.androidopencv.cameracontrol.Tutorial3Activity;
import com.zjp.androidopencv.colorblobdetect.ColorBlobDetectionActivity;
import com.zjp.androidopencv.facedetect.FdActivity;
import com.zjp.androidopencv.imagemanipulations.ImageManipulationsActivity;
import com.zjp.androidopencv.mixedprocessing.Tutorial2Activity;
import com.zjp.androidopencv.puzzle.Puzzle15Activity;

import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.Mat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.puzzle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Puzzle15Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.camera_calibration).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraCalibrationActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.face).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FdActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ColorBlobDetectionActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageManipulationsActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.mixed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tutorial2Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.control).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tutorial3Activity.class);
                startActivity(intent);
            }
        });



    }
}