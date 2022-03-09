package harish.project.daysix;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
             if(b)
             {
                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                 builder.setTitle("Toogle Button");
                 builder.setMessage("Are you sure for this!");
                 builder.setCancelable(false);
                 builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Toast.makeText(MainActivity.this,"Topic Cleared", Toast.LENGTH_SHORT).show();
                         Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                         startActivity(intent);
                         finish();
                     }
                 });
                 builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         dialogInterface.dismiss();
                     }
                 });
                 builder.show();
             }
             else
             {
                 Toast.makeText(MainActivity.this, "Better Luck Next Time!!", Toast.LENGTH_SHORT).show();
             }



            }
        });
    }
}