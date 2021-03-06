package com.example.towersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView disk0TV, disk1TV, disk2TV;
    private ViewGroup tower0VG, tower1VG, tower2VG, placeholderVG;
    private Stack tower2Stack = new Stack();
    private Stack tower0Stack = new Stack();
    private Stack tower1Stack = new Stack();
    private int topValue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.disk0TV = this.findViewById(R.id.disk0);
        this.disk1TV = this.findViewById(R.id.disk1);
        this.disk2TV = this.findViewById(R.id.disk2);

        this.placeholderVG = this.findViewById(R.id.placeHolderVG);
        this.tower0VG = this.findViewById(R.id.tower0VG);
        this.tower1VG = this.findViewById(R.id.tower1VG);
        this.tower2VG = this.findViewById(R.id.tower2VG);

        tower0Stack.push(8);
        tower0Stack.push(4);
        tower0Stack.push(2);

    }

    public void tower0ButtonPressed(View v)
    {
        if(topValue <= 0)
        {
            View temp = this.tower0VG.getChildAt(0);
            this.tower0VG.removeViewAt(0);
            this.placeholderVG.addView(temp);
            topValue = tower0Stack.pop();
        }
        else
        {
            if(tower0Stack.getCount() == 0 || topValue < tower0Stack.peek())
            {
                View temp = this.placeholderVG.getChildAt(0);
                this.placeholderVG.removeViewAt(0);
                this.tower0Stack.push(topValue);
                this.tower0VG.addView(temp,0);
                topValue = 0;
            }
        }
    }

    public void tower1ButtonPressed(View v)
    {
        if(topValue <= 0)
        {
            View temp = this.tower1VG.getChildAt(0);
            this.tower1VG.removeViewAt(0);
            this.placeholderVG.addView(temp);
            topValue = tower1Stack.pop();
        }
        else
        {
            if(tower1Stack.getCount() == 0 || topValue < tower1Stack.peek())
            {
                View temp = this.placeholderVG.getChildAt(0);
                this.placeholderVG.removeViewAt(0);
                this.tower1Stack.push(topValue);
                this.tower1VG.addView(temp, 0);
                topValue = 0;
            }
        }
    }
    public void tower2ButtonPressed(View v)
    {
        if(topValue <= 0)
        {
            View temp = this.tower2VG.getChildAt(0);
            this.tower2VG.removeViewAt(0);
            this.placeholderVG.addView(temp);
            topValue = tower2Stack.pop();
        }
        else
        {
            if(tower2Stack.getCount() == 0 || topValue < tower2Stack.peek())
            {
                View temp = this.placeholderVG.getChildAt(0);
                this.placeholderVG.removeViewAt(0);
                this.tower2Stack.push(topValue);
                this.tower2VG.addView(temp, 0);
                topValue = 0;
            }
        }
    }
}
