package com.example.jeremyt.transfer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by rck on 4/17/2015.
 */
public class Button {
    EncounterType encounterType;
    public RectF bounds;
    Bitmap bitmap;
    public Button(EncounterType encounterType, RectF bounds, Bitmap bitmap){
        this.encounterType = encounterType;
        this.bitmap = bitmap;
        this.bounds = bounds;
    }
    public boolean isClicked(float clickX, float clickY){
        boolean ret = false;
            if(bounds != null)
                if(bounds.contains(clickX,clickY))
                    ret = true;
        return ret;
    }

    public void draw(Canvas canvas){
        if (bounds != null)
            canvas.drawBitmap(bitmap,null,bounds,null);
    }

}
