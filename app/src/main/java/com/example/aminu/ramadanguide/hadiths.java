package com.example.aminu.ramadanguide;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class hadiths extends Fragment {

    TextView hadith1;
    TextView hadith2;
    TextView hadith3;
    TextView hadith4;
    TextView hadith5;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mHadithRef = mRootRef.child("hadith1");

    DatabaseReference mRootRef2 = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mHadithRef2 = mRootRef2.child("hadith2");

    DatabaseReference mRootRef3 = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mHadithRef3 = mRootRef3.child("hadith3");

    DatabaseReference mRootRef4 = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mHadithRef4 = mRootRef4.child("hadith4");

    DatabaseReference mRootRef5 = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mHadithRef5 = mRootRef5.child("hadith5");

    public hadiths() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_hadiths, container, false);



        //Get the UI elements
        hadith1 = (TextView) rootView.findViewById(R.id.hadith1);
        hadith2 = (TextView) rootView.findViewById(R.id.hadith2);
        hadith3 = (TextView) rootView.findViewById(R.id.hadith3);
        hadith4 = (TextView) rootView.findViewById(R.id.hadith4);
        hadith5 = (TextView) rootView.findViewById(R.id.hadith5);
        return rootView;
    }

    @Override
    public void  onStart(){
        super.onStart();

        mHadithRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hadith1.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mHadithRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hadith2.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mHadithRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hadith3.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mHadithRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hadith4.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mHadithRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hadith5.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


}
