package com.example.todoapp.ui.fragments.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.todoapp.R;
import com.example.todoapp.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initListeners();

    }

    private void initListeners() {

        binding.saveBtn.setOnClickListener(v -> {
            sendData();
            closeFragment();

        });
    }

    private void sendData() {
        String text = binding.enterEt.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("textKey", text);
        getParentFragmentManager().setFragmentResult("key", bundle);

}

    private void closeFragment() {
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
        navController.navigateUp();
    }

}
