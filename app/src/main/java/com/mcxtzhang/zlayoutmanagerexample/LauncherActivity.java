package com.mcxtzhang.zlayoutmanagerexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mcxtzhang.zlayoutmanagerexample.avatar.TanTanAvatarActivity;
import com.mcxtzhang.zlayoutmanagerexample.gallary.GalleryActivity;
import com.mcxtzhang.zlayoutmanagerexample.gallery.LoopGalleryActivity;
import com.mcxtzhang.zlayoutmanagerexample.swipecard.SwipeCardActivity;
import com.mcxtzhang.zlayoutmanagerexample.tantan.TanTanActivity;
import com.mcxtzhang.zlayoutmanagerexample.zuimei.ScaleCardActivity;


public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        findViewById(R.id.btnFlow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, MainActivity.class));
            }
        });
        findViewById(R.id.btnSwipeCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, SwipeCardActivity.class));
            }
        });
        findViewById(R.id.btnKing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, TanTanActivity.class));
            }
        });
        findViewById(R.id.btnGallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, GalleryActivity.class));
            }
        });
        findViewById(R.id.btnZuimeiCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, ScaleCardActivity.class));
            }
        });
        findViewById(R.id.btnTantanAvatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, TanTanAvatarActivity.class));
            }
        });
        findViewById(R.id.btnLoopGallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, LoopGalleryActivity.class));
            }
        });
    }
}
