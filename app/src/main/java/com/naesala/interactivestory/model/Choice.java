package com.naesala.interactivestory.model;

public class Choice {
    private String mText;
    //Text that describes the choice
    private int mNextPage;
    //We're going to use the index of the pages in the array to link one to another

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
