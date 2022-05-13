package com.example.contact.ui.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020\u0015H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/contact/ui/view/fragment/MainFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/contact/ClicListenner;", "()V", "_binding", "Lcom/example/contact/databinding/FragmentMainBinding;", "get_binding", "()Lcom/example/contact/databinding/FragmentMainBinding;", "set_binding", "(Lcom/example/contact/databinding/FragmentMainBinding;)V", "binding", "getBinding", "mainFragmentViewModel", "Lcom/example/contact/ui/viewmodel/fragment/MainFragmentViewModel;", "getMainFragmentViewModel", "()Lcom/example/contact/ui/viewmodel/fragment/MainFragmentViewModel;", "mainFragmentViewModel$delegate", "Lkotlin/Lazy;", "recyclerAdapter", "Lcom/example/contact/ui/adapter/RecyclerAdapter;", "clic", "", "id", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "updateRecyclerAdapter", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainFragment extends androidx.fragment.app.Fragment implements com.example.contact.ClicListenner {
    public com.example.contact.databinding.FragmentMainBinding _binding;
    private com.example.contact.ui.adapter.RecyclerAdapter recyclerAdapter;
    private final kotlin.Lazy mainFragmentViewModel$delegate = null;
    
    public MainFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contact.databinding.FragmentMainBinding get_binding() {
        return null;
    }
    
    public final void set_binding(@org.jetbrains.annotations.NotNull()
    com.example.contact.databinding.FragmentMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contact.databinding.FragmentMainBinding getBinding() {
        return null;
    }
    
    private final com.example.contact.ui.viewmodel.fragment.MainFragmentViewModel getMainFragmentViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void updateRecyclerAdapter() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void clic(int id) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}