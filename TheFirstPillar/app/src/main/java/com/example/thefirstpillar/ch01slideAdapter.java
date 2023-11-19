package com.example.thefirstpillar;


import static android.content.Context.LAYOUT_INFLATER_SERVICE;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;

public class ch01slideAdapter extends PagerAdapter{


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    public class SliderAdapter extends PagerAdapter {

        Context context;
        LayoutInflater layoutInflater;

        public SliderAdapter(Context context) {
            this.context = context;

        }

        //Arrays
        public int[] slideImages = {

                R.drawable.logo,
                R.drawable.locked
        };
        public String[] slideTexts = {
                "باید دانست که ذکر در لغت یاد و به اصطلاح نوعی از ثنا خوانی مخلوق است به خالق و رازق کل جل شأنه.",
                "17.\tآری! این دیوانگان مدعی کمال را می توان به رهبری سلیم قرآن دست نا خورده اسلام توسط مساعی مدرسین مدرسه قرآن به شاهراه هدایت و معرفت به یاری خدای عظیم با حشمت، نظر به دوره قهر زمان نوح علیه السلام بر عکس به طوفان رحمت جهانشمول رهبری و پیشوایی نمود."
        };


        @Override
        public int getCount() {
            return slideTexts.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == (RelativeLayout) o;
        }

        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

            ImageView slideImageView = (ImageView) view.findViewById(R.id.slideImage);
            TextView slidetextView = (TextView) view.findViewById(R.id.slideText);
            //TextView slideNumView = (TextView) view.findViewById(R.id.slideNumber);

            slideImageView.setImageResource(slideImages[position]);
            slidetextView.setText(slideTexts[position]);
            // slideNumView.setText(slidePageNumbers[position]);

            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            super.destroyItem(container, position, object);
        }
    }
}