package com.example.pupomonth;

import static com.example.pupomonth.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.board_all);

        findViewById(id.btn).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(final View view) {
                final PopupMenu popupMenu = new PopupMenu(getApplicationContext(),view);
                getMenuInflater().inflate(drawable.popup_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem.getItemId() == id.action_menu1){
                            Toast.makeText(MainActivity.this, "전체 보기 클릭", Toast.LENGTH_SHORT).show();
                        }else if (menuItem.getItemId() == id.action_menu2){
                            Toast.makeText(MainActivity.this, "관리자 공지 클릭", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, "내 게시물 클릭", Toast.LENGTH_SHORT).show();
                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

}