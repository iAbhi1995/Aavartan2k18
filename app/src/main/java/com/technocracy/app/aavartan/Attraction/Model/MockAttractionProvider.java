package com.technocracy.app.aavartan.Attraction.Model;

import android.os.Handler;

import com.technocracy.app.aavartan.Attraction.AttractionCallback;
import com.technocracy.app.aavartan.Attraction.Model.Data.Attraction;
import com.technocracy.app.aavartan.Attraction.Model.Data.AttractionData;

import java.util.ArrayList;
import java.util.List;

public class MockAttractionProvider implements AttractionProvider {

    private AttractionData mockData;

    @Override
    public void getAttractions(final AttractionCallback callback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onSuccess(getMockData());
            }
        }, 500);
    }

    public AttractionData getMockData() {
        List<Attraction> list = new ArrayList<>();
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        list.add(new Attraction("Bike Stunts", "7th October 2018", "In fornt of central garden.", "Bikers to do stunts", "http://pluspng.com/img-png/dirt-bike-wheelie-png-motorcycle-stunt-riding-wheelie-drawing-chopper-motocross-900.jpg"));
        mockData = new AttractionData(true, list);
        return mockData;
    }
}