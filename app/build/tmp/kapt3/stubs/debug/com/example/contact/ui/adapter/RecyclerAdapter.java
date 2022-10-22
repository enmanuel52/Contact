package com.example.contact.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/contact/ui/adapter/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contact/ui/adapter/RecyclerAdapter$ViewHolder;", "listener", "Lcom/example/contact/SelectedClickListener;", "(Lcom/example/contact/SelectedClickListener;)V", "items", "", "Lcom/example/contact/data/model/ContactItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getListener", "()Lcom/example/contact/SelectedClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contact.ui.adapter.RecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.contact.SelectedClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.contact.data.model.ContactItem> items;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.example.contact.SelectedClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contact.SelectedClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.contact.data.model.ContactItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.contact.data.model.ContactItem> p0) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/contact/ui/adapter/RecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/contact/databinding/RecyclerLayoutBinding;", "(Lcom/example/contact/ui/adapter/RecyclerAdapter;Lcom/example/contact/databinding/RecyclerLayoutBinding;)V", "onBind", "", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.contact.databinding.RecyclerLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.contact.databinding.RecyclerLayoutBinding binding) {
            super(null);
        }
        
        public final void onBind(int position) {
        }
    }
}