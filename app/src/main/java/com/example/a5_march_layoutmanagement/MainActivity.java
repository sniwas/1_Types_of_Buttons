package com.example.a5_march_layoutmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageButton ib;
    CheckBox cb;
    ToggleButton tb;
    Switch s;
    FloatingActionButton f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button3);
        ib=findViewById(R.id.imageButton);
        cb=findViewById(R.id.checkBox);
        tb=findViewById(R.id.toggleButton);
        s=findViewById(R.id.switch1);
        f=findViewById(R.id.floatingActionButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image Button is clicked", Toast.LENGTH_LONG).show();
            }
        });
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Checkbox clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Checkbox is notchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if(tb.isChecked())
           {
               Toast.makeText(getApplicationContext(), "Toggle button is clicked", Toast.LENGTH_SHORT).show();
           }
           else {
               Toast.makeText(getApplicationContext(), "Toggle button is unclicked", Toast.LENGTH_SHORT).show();
           }
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Switch is activated", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Switch is not activated", Toast.LENGTH_SHORT).show();
                }
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Floating Action Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

/* Table Layout
 <TableRow
        android:layout_width="fill_parent"
        android:layout_height="fill_parent">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_column="1"
            android:text="Name"
            android:textSize="48sp" />
    </TableRow>

    <EditText
        android:id="@+id/edittext"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
         android:inputType="textPersonName"
        android:text="Name"
        android:textSize="34sp" />
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_alignParentStart="true"
        android:layout_below="@id/edittext">
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
         />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
         />
    </LinearLayout>
 */