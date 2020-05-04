package com.example.sistematurnos.ui.turnos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sistematurnos.R;

public class TurnosFragment extends Fragment {

    private TurnosViewModel TurnosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TurnosViewModel =
                ViewModelProviders.of(this).get(TurnosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_turnos, container, false);
        final TextView textView = root.findViewById(R.id.text_turnos);
        TurnosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
