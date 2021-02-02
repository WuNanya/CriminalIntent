package com.example.photogalleryactivity;

import androidx.fragment.app.Fragment;


public class PhotoGalleryActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}