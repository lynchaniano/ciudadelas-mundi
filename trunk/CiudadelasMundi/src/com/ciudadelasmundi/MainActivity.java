package com.ciudadelasmundi;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	private static final String LOGTAG = "CiudadelasMundi";
    		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establecemos Layout y vistas
        setContentView(R.layout.main);
      
    }    

}

