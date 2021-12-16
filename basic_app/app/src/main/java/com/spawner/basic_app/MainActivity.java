package com.spawner.basic_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      
 ​open​ ​class​ ​MainActivity​ : ​BaseActivity​<​MainActivityBinding​>(), DownloadServiceListener { 
  
 ​    ​protected​ ​lateinit​ ​var​ router​:​ ​Router 
  
 ​    ​val​ source​:​ ​Source​ by lazy { ​Injekt​.get<​SourceManager​>().getMangadex() } 
 ​    ​private​ ​val​ searchDrawable by lazy { contextCompatDrawable(​R​.drawable.ic_search_24dp) } 
 ​    ​protected​ ​val​ backDrawable by lazy { contextCompatDrawable(​R​.drawable.ic_arrow_back_24dp) } 
 ​    ​private​ ​val​ dismissDrawable by lazy { contextCompatDrawable(​R​.drawable.ic_close_24dp) }
}
