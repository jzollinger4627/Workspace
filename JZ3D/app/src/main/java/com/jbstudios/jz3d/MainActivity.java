package com.jbstudios.jz3d;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int width;
    private int height;
    private int totalPixels;
    private int[][] pixels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View panel = (View) findViewById(R.id.panel);
        height = panel.getHeight();
        width = panel.getWidth();
        totalPixels = width * height;

        pixels = new int[totalPixels][3];
        for (int i=0;i<totalPixels;i++) {
            for (int e=0;e<3;e++) {
                pixels[i][e] = 0;
            }
        }

        Canvas canvas = new Canvas();
        for (int i=0;i<height;i++) {
            for (int e=0;e<width;e++) {
                canvas.drawColor(Color.rgb(pixels[e+i*width][0],pixels[e+i*width][1],pixels[e+i*width][2]));
                canvas.drawRect(e,i,e,i,new paint());
            }
        }

        panel.draw(canvas);

    }
}
