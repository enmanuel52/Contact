package com.example.contact.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/contact/ui/adapter/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contact/ui/adapter/RecyclerAdapter$ViewHolder;", "clic", "Lcom/example/contact/ClicListenner;", "(Lcom/example/contact/ClicListenner;)V", "items", "", "Lcom/example/contact/data/database/entities/ContactEntity;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contact.ui.adapter.RecyclerAdapter.ViewHolder> {
    private final com.example.contact.ClicListenner clic = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.contact.data.database.entities.ContactEntity> items;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.example.contact.ClicListenner clic) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.contact.data.database.entities.ContactEntity> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.contact.data.database.entities.ContactEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.contact.ui.adapter.RecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.contact.ui.adapter.RecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/contact/ui/adapter/RecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/contact/ui/adapter/RecyclerAdapter;Landroid/view/View;)V", "binding", "Lcom/example/contact/databinding/RecyclerLayoutBinding;", "getBinding", "()Lcom/example/contact/databinding/RecyclerLayoutBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.contact.databinding.RecyclerLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.contact.databinding.RecyclerLayoutBinding getBinding() {
            return null;
        }
    }
}