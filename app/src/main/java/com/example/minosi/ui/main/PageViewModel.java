package com.example.minosi.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.minosi.R;

import java.util.Arrays;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
//    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
//        @Override
//        public String apply(Integer input) {
//            return "Hello world from section: " + input;
//        }
//    });

    private LiveData<Object> mContent = Transformations.map(mIndex, new Function<Integer, Object>() {
        @Override
        public Object apply(Integer input) {
            if (input == 1) {
                // Return an identifier for the image, for example, a resource ID
                return R.drawable.iphone;
            }
            else if (input == 2) {
                // Return a list of items
                return Arrays.asList("Dimensions: 146.7 x 71.5 x 7.8 mm (5.78 x 2.81 x 0.31 in)",
                        "Weight: 172 g (6.07 oz)",
                        "Build: Glass front (Ceramic Shield), glass back, aluminum frame",
                        "Colors: Midnight, Starlight, Blue, Purple, (PRODUCT)RED, Yellow",
                        "Type: Super Retina XDR OLED",
                        "Resolution: 1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)",
                        "CPU: Hexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)",
                        "Chipset: Apple A15 Bionic (5 nm)");
            }
            else {
                return "Hello world from section: " + input;
            }
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

//    public LiveData<String> getText() {
//        return mText;
//    }

    public LiveData<Object> getContent() {
        return mContent;
    }
}