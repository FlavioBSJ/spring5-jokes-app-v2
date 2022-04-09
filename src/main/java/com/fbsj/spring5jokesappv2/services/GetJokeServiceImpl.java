package com.fbsj.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GetJokeServiceImpl implements GetJokeService {

    public final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
