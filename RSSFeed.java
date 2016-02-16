//
//  RSSFeed.java
//  RSSParser
//
//  Created by Mustafa Youldash on 14/02/2016.
//  Copyright © 2016 Umm Al-Qura University. All rights reserved.
//
//  Except where otherwise noted, this work is vested in Umm Al-Qura University <http://www.uqu.edu.sa/> and is licensed under the
//  Creative Commons Attribution-NonCommercial 4.0 International License <http://creativecommons.org/licenses/by-nc/4.0/>.
//
//  Unless otherwise stated, no part of this work may be reproduced and redistributed by any process,
//  nor used for commercial purposes without the written permission of Umm Al-Qura University and the author.
//
//  If you modify or build upon the work, you may only distribute the resulting work under the same license conditions as this one.
//

package sa.edu.uqu.cis.rss;

import android.text.format.Time;

import java.util.ArrayList;
import java.util.Date;

public class RSSFeed
{
    // Feed type.
    private RSSFeedType type;

    // Feed title.
    private String title;

    // Feed description.
    private String description;

    // Feed URL.
    private String url;

    // Feed date.
    private Date date;

    // Feed author.
    private String author;

    // Feed articles.
    private ArrayList<String> articles;

    // Feed uid.
    private String uid;

    // Feed language.
    private String language;

    // Feed copyright.
    private String copyright;

    // Feed categories.
    private ArrayList<String> categories;

    // Feed generator.
    private String generator;

    // Feed valid time.
    private Time validTime;

    // Feed icon URL.
    private String iconUrl;

    /* Creating. */

    /**
     * Constructor stub.
     */
    public RSSFeed()
    {
        // Initialize the array lists.
        articles = new ArrayList<String>();
        categories = new ArrayList<String>();
    }

    /**
     * @return the description.
     */
    @Override
    public String toString()
    {
        return getType() + " " + getTitle();
    }

	/* Accessing. */

    public RSSFeedType getType()
    {
        return type;
    }

    public void setType(RSSFeedType type)
    {
        this.type = type;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public ArrayList<String> getArticles()
    {
        return articles;
    }

    public void setArticles(ArrayList<String> articles)
    {
        this.articles = articles;
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    public ArrayList<String> getCategories()
    {
        return categories;
    }

    public void setCategories(ArrayList<String> categories)
    {
        this.categories = categories;
    }

    public String getGenerator()
    {
        return generator;
    }

    public void setGenerator(String generator)
    {
        this.generator = generator;
    }

    public Time getValidTime()
    {
        return validTime;
    }

    public void setValidTime(Time validTime)
    {
        this.validTime = validTime;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl)
    {
        this.iconUrl = iconUrl;
    }
}
