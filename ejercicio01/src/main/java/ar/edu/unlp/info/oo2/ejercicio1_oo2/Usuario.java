package ar.edu.unlp.info.oo2.ejercicio1_oo2;

import java.util.*;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName=screenName;
		this.tweets=new ArrayList<>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	private boolean checkChars(String text) {
		return text.length() >0 && text.length()<281;
	}
	public Tweet postTweet(String text) {
		if (this.checkChars(text)) {
			Tweet newTweet=new TextTweet(text);
			this.tweets.add(newTweet);
			return newTweet;
		}
		return null;
	}
	
	public Tweet rtTweet(Tweet tw) {
		Tweet newRt=new Retweet(tw.getTw());
		this.tweets.add(newRt);
		return newRt;
	}
	
	public String readTweet(Tweet tw) {
		System.out.println(this.screenName+" leyó el tweet: "+ tw.getText());
		return (tw.getText());
	}
	
	private void purgeTweets(Tweet tw) {
		this.tweets = this.tweets.stream()
				.filter(tweet->!(tweet.getTw().equals(tw)))
				.toList();
	}
	
	public void deleteTweets(List<Tweet> tws) {
		tws.stream().forEach(tweet->this.purgeTweets(tweet));
	}
	
	public List<Tweet> getTweets (){
		return this.tweets;
	}
}
