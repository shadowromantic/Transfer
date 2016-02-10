package com.example.jeremyt.transfer;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;
import java.util.Vector;

/**
 * Created by rck on 4/17/2015.
 */
public class EncounterView extends View {
    MainActivity main;
    boolean debugMode = true;
    Bitmap bg_punishment, bg_puppy, bg_bondage, bg_submissive, bg_domination;

    Bitmap g_punishment, g_puppy, g_bondage, g_submissive, g_domination;
    Vector<Button> buttons = new Vector<>();
    RectF LL,LR,UL,UR, r_title, r_description, r_background;
    TextBox tb_title, tb_description;
    AssetManager assetManager;
    Button lastChoice;
    Typeface typeface;
    Deck deck;
    Random rand = new Random();
    static int TITLETEXTSIZE = 24,DESCRIPTIONTEXTSIZE = 18, TITLELENGTH = 18, DESCRIPTIONLENGTH = 23;
    int titleTextSize,descriptionsTextSize;
    Encounter currentEncounter;

    public EncounterView(Context context) {
        super(context);
        main = (MainActivity)context;
        assetManager = main.getAssets();
        typeface = Typeface.createFromAsset(main.getAssets(), "fonts/ArchitectsDaughter.ttf");
        final float scale = main.getResources().getDisplayMetrics().density;
        titleTextSize = (int) (TITLETEXTSIZE * scale + 0.5f);
        descriptionsTextSize = (int) (DESCRIPTIONTEXTSIZE * scale + 0.5f);
        deck = new Deck();
        createQuadrants();
        loadBitmaps();
        createButtons();
        currentEncounter = new Encounter("Dominapp","Domination is exciting; there’s a special thrill that comes with controlling another person. But at the same time, coming up with new activities can be a challenge.  Here you’ll find new ways to use your slave (or be used by your owner).\n",EncounterType.INTRO);
        tb_description = new TextBox(r_description,currentEncounter.description,descriptionsTextSize,DESCRIPTIONLENGTH,typeface);
        tb_title = new TextBox(r_title,currentEncounter.title,titleTextSize,TITLELENGTH,typeface);

    }

    public boolean onTouchEvent(MotionEvent event) {
        int eventaction = event.getAction();
        switch (eventaction) {
            case MotionEvent.ACTION_DOWN:
                //cardFactory.chooseRandomCard();
                float clickX = event.getX();
                float clickY = event.getY();
                for (int i = 0; i < buttons.size(); i++){
                    if (buttons.elementAt(i).isClicked(clickX,clickY)){
                        lastChoice = buttons.elementAt(i);
                        currentEncounter = deck.getEncounterOfType(lastChoice.encounterType);
                        tb_description = new TextBox(r_description,currentEncounter.description,descriptionsTextSize,DESCRIPTIONLENGTH,typeface);
                        tb_title = new TextBox(r_title,currentEncounter.title,titleTextSize,TITLELENGTH,typeface);
                    }

                }
                shuffleButtons();
                // finger touches the screen
        }
        return true;
    }

    private void createQuadrants(){
        float upper = .6f*main.screenHeight;
        float buffer = main.screenWidth *.1f;
        float half = main.screenWidth*.5f;
        float lower = .73f*main.screenHeight;
        float width = .4f*main.screenWidth;
        float height = .1f*main.screenHeight;
        UL = new RectF(buffer,upper,buffer+width,upper+height);
        UR = new RectF(half,upper,2*half-buffer,upper+height);
        LL = new RectF(buffer,lower,buffer+width,lower+height);
        LR = new RectF(half,lower,2*half-buffer,lower+height);
        r_title = new RectF(buffer*.25f,buffer,main.screenWidth-buffer, height);
        r_description = new RectF(buffer*.25f,height+buffer,main.screenWidth-buffer, upper);
        r_background = new RectF(0,buffer+height,main.screenWidth,upper);
    }
    private void createButtons(){
        Button b_punishment, b_puppy, b_bondage, b_submissive, b_domination;

        b_bondage = new Button(EncounterType.BONDAGE,UL,g_bondage);
        b_domination = new Button (EncounterType.DOMINATION,UR,g_domination);
        b_punishment = new Button (EncounterType.PUNISHMENT, LL, g_punishment);
        b_submissive = new Button (EncounterType.SUBMISSIVE_TRICKS,LR,g_submissive);
        b_puppy = new Button (EncounterType.PUPPY_PLAY,null,g_puppy);
        lastChoice = b_bondage;
        buttons.add(b_bondage);
        buttons.add(b_domination);
        buttons.add(b_punishment);
        buttons.add(b_submissive);
        buttons.add(b_puppy);
    }

    private void shuffleButtons(){
        lastChoice.bounds = UL;
        Vector<Button> buttonPool = new Vector();
        int r;
        for (int i = 0; i < buttons.size(); i++){
            if (buttons.elementAt(i) != lastChoice)
            {
                buttons.elementAt(i).bounds = null;
                buttonPool.add(buttons.elementAt(i));
            }
        }
        r = rand.nextInt(buttonPool.size());
        buttonPool.elementAt(r).bounds = UR;
        buttonPool.remove(buttonPool.elementAt(r));

        r = rand.nextInt(buttonPool.size());
        buttonPool.elementAt(r).bounds = LL;
        buttonPool.remove(buttonPool.elementAt(r));

        r = rand.nextInt(buttonPool.size());
        buttonPool.elementAt(r).bounds = LR;
        buttonPool.remove(buttonPool.elementAt(r));

    }

    private void loadBitmaps(){
        g_punishment = BitmapFactory.decodeResource(getResources(), R.drawable.punishment);
        g_bondage = BitmapFactory.decodeResource(getResources(), R.drawable.bondage);
        g_domination = BitmapFactory.decodeResource(getResources(), R.drawable.domination);
        g_puppy = BitmapFactory.decodeResource(getResources(), R.drawable.pupplyplay);
        g_submissive = BitmapFactory.decodeResource(getResources(), R.drawable.submissivetricks);
        bg_bondage = BitmapFactory.decodeResource(getResources(), R.drawable.bg_bondage);
        bg_domination= BitmapFactory.decodeResource(getResources(), R.drawable.bg_domination);
        bg_punishment = BitmapFactory.decodeResource(getResources(), R.drawable.bg_punishment);
        bg_puppy = BitmapFactory.decodeResource(getResources(), R.drawable.bg_puppy);
        bg_submissive = BitmapFactory.decodeResource(getResources(), R.drawable.bg_submissive);
    }

    private void drawButtons(Canvas canvas){
        int L = buttons.size();
        for (int i = 0; i < L; i++)
           buttons.elementAt(i).draw(canvas);
    }

    private void drawBackground(Canvas canvas){
        switch(currentEncounter.encounterType){

            case PUPPY_PLAY:
                canvas.drawBitmap(bg_puppy,null,r_background,null);
                break;
            case SUBMISSIVE_TRICKS:
                canvas.drawBitmap(bg_submissive,null,r_background,null);
                break;
            case PUNISHMENT:
                canvas.drawBitmap(bg_punishment,null,r_background,null);
                break;
            case BONDAGE:
                canvas.drawBitmap(bg_bondage,null,r_background,null);
                break;
            case DOMINATION:
                canvas.drawBitmap(bg_domination,null,r_background,null);
                break;
            case INTRO:
                break;
        }
    }

    protected void onDraw(Canvas canvas) {

        //draw encounterBackground
        drawBackground(canvas);
        tb_description.draw(canvas);
        tb_title.draw(canvas);
        drawButtons(canvas);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        invalidate();

    }

    private void say(String s){
        if (debugMode)
            System.out.println("RCK:" + s);
    }
}