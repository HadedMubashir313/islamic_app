package com.example.thefirstpillar;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.viewpager.widget.ViewPager;

        import android.content.Intent;
        import android.os.Bundle;
        import android.text.Html;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

public class chela_awal extends AppCompatActivity {

    private ViewPager nSlideViewPager;
    private LinearLayout nDotLayout;

    private SliderAdapter sliderAdapter;
    private TextView[] nDots;
    private ImageButton back, next;
    private int currentPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chela_awal);

        nSlideViewPager = (ViewPager) findViewById(R.id.layoutPager);
        nDotLayout = (LinearLayout) findViewById(R.id.layoutLiner);
        back = (ImageButton) findViewById(R.id.btnback);
        next = (ImageButton) findViewById(R.id.btnnext);

        sliderAdapter = new SliderAdapter(this);
        nSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        nSlideViewPager.addOnPageChangeListener(viewListener);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nSlideViewPager.setCurrentItem (currentPage+1);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nSlideViewPager.setCurrentItem (currentPage-1);
            }
        });

    }

    public void addDotsIndicator(int position){
        nDots = new TextView[2];

        for( int i=0; i< nDots.length; i++){

            nDots[i]= new TextView(this);
            nDots[i].setText(Html.fromHtml("&#822;"));
            nDots[i].setTextSize(40);
            nDots[i].setTextColor(getResources().getColor(R.color.white));

            nDotLayout.addView(nDots[i]);


        }

        if(nDots.length>0){
            nDots[position].setTextColor(getResources().getColor(R.color.dark_blue));
        }
    }



    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            currentPage = i;

            if(i==0){
                next.setEnabled(true);
                back.setEnabled(false);
                back.setVisibility(View.INVISIBLE);
            }
            else if(i == nDots.length-1){
                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);

                Toast.makeText(getApplicationContext() , "Nothing else to view", Toast.LENGTH_LONG).show();
            }else{
                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);
            }
        }



        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}