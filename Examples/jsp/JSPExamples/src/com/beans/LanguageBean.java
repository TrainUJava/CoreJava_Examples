package com.beans;

public class LanguageBean {

  private String name;
  private String language;

  public LanguageBean() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getLanguage() {
    return language;
  }

  public String getLanguageComments() {
    if (language.equals("Java")) {
      return "The king of OO languages.";
    } else if (language.equals("C++")) {
      return "Rather too complex for some folks' liking.";
    } else if (language.equals("Perl")) {
      return "OK if you like incomprehensible code.";
    } else {
      return "Sorry, I've never heard of " + language + ".";
    }
  }
}