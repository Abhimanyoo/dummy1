package com.example.viewpager2withtablayoutandroidexample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return CardFragment.newInstance(position);
    }

    private static final int CARD_ITEM_SIZE = 10;

    @Override
    public int getItemCount() {
        return CARD_ITEM_SIZE;
    }

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


}
