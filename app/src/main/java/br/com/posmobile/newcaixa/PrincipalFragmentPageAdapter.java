package br.com.posmobile.newcaixa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.RelativeLayout;

/**
 * Created by tiagocosta on 31/05/2017.
 */

class PrincipalFragmentPageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"Home","Notificações","Configurações"};
    private Context context;

    public PrincipalFragmentPageAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return LogonFragment.newInstance(position + 1);
            case 1:
                //return NotificationsFragment.newInstance(position + 1);
                return LoteriaFragment.newInstance(position + 1);
            case 2:
                //return ConfigFragment.newInstance(position + 1);
                return ExtratoFragment.newInstance(position + 1);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];
        Drawable image = ContextCompat.getDrawable(context, imageResId[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" \n" + tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;

    }

    private int[] imageResId = {
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_chat_bubble_black_24dp,
            R.drawable.ic_settings_black_24px
    };


}
