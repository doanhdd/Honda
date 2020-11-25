package com.example.myhonda.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myhonda.R;
public class FragmentTinTuc extends Fragment {
    WebView mWebView;
    public FragmentTinTuc() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tin_tuc, container, false);
        mWebView = (WebView) rootView.findViewById(R.id.wedView_Thongtin);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://sorento.kiamotorsvietnam.com.vn/?utm_source=Google&utm_medium=CPC&utm_campaign=KIA_Sorento&utm_content=SEM_Generic_Keyword&gclid=CjwKCAiA2O39BRBjEiwApB2IkhQ24xu5Jlg9rbYF6fvNlVChcst44QJUTG234qd-u_osrgsjPueQuRoCi7AQAvD_BwE ");
        return rootView;
    }
}