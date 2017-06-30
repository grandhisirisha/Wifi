package com.example.mlrit.wifi;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch s;
    TextView t;
    String str="";

    BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter()


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s=(Switch)findViewById(R.id.sw);
        t=(TextView)findViewById(R.id.tv);

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                         @Override
                                         public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                                             if (isChecked)
                                             {
                                                 WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                                                 wifi.setWifiEnabled(true);
                                                 t.setText("ON");
                                                 str="Your mobile wifi is ON";
                                             }
                                             else
                                             {
                                                 WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                                                 wifi.setWifiEnabled(false);
                                                 t.setText("OFF");
                                                 str="Your mobile wifi is OFF";
                                             }
                                         }
                                     }
        );




            }
        });
    }
}