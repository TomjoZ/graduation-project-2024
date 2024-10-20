package com.adobe.learning.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class DefaultModel {

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String companyName;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String phoneNumber;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String copyright;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String homeTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String popularCoursesTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course1Description;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String author1Name;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course1Price;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course2Description;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String author2Name;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course2Price;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String newsletterTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerCompanyName;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerAbout;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerMenuTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerLinksTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerContactTitle;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String address;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String contactPhoneNumber;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String contactEmail;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerCopyright;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String preferences;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String emailUpdates;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String smsNotifications;





    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String logoReference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String contactIconReference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course1Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String author1Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course2Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String author2Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerLogoReference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String placeholderIconReference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String phoneIconReference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String emailIconReference;



    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String home;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean homeCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String about;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean aboutCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String courses;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean coursesCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String elements;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean elementsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String news;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean newsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String contact;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean contactCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuHome;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuHomeCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuAbout;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuAboutCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuCourses;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuCoursesCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuElements;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuElementsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuNews;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuNewsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String menuContact;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean menuContactCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String pinterest;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean pinterestCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String linkedin;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean linkedinCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String instagram;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean instagramCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String facebook;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean facebookCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String twitter;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean twitterCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course1;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean course1Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String course2;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean course2Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerHome;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerHomeCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerAbout;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerAboutCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerCourses;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerCoursesCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerNews;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerNewsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerContact;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerContactCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String testimonials;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean testimonialsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String faq;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean faqCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String community;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean communityCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String campusPictures;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean campusPicturesCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String tuitions;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean tuitionsCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerPinterest;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerPinterestCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerLinkedIn;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerLinkedInCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerInstagram;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerInstagramCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerFacebook;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerFacebookCheckbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String footerTwitter;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean footerTwitterCheckbox;


    public String getCompanyName(){
        return companyName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getCopyright(){
        return copyright;
    }

    public String getHomeTitle(){
        return homeTitle;
    }

    public String getPopularCoursesTitle(){
        return popularCoursesTitle;
    }

    public String getCourse1Description(){
        return course1Description;
    }

    public String getAuthor1Name(){
        return author1Name;
    }

    public String getCourse1Price(){
        return course1Price;
    }

    public String getCourse2Description(){
        return course2Description;
    }

    public String getAuthor2Name(){
        return author2Name;
    }

    public String getCourse2Price(){
        return course2Price;
    }

    public String getNewsletterTitle(){
        return newsletterTitle;
    }

    public String getFooterCompanyName(){
        return footerCompanyName;
    }

    public String getFooterAbout(){
        return footerAbout;
    }

    public String getFooterMenuTitle(){
        return footerMenuTitle;
    }

    public String getFooterLinksTitle(){
        return footerLinksTitle;
    }

    public String getFooterContactTitle(){
        return footerContactTitle;
    }

    public String getAddress(){
        return address;
    }

    public String getContactPhoneNumber(){
        return contactPhoneNumber;
    }

    public String getContactEmail(){
        return contactEmail;
    }

    public String getFooterCopyright(){
        return footerCopyright;
    }

    public String getPreferences(){
        return preferences;
    }

    public String getEmailUpdates(){
        return emailUpdates;
    }

    public String getSmsNotifications(){
        return smsNotifications;
    }





    public String getLogoReference(){
        return logoReference;
    }

    public String getContactIconReference(){
        return contactIconReference;
    }

    public String getCourse1Reference(){
        return course1Reference;
    }

    public String getAuthor1Reference(){
        return author1Reference;
    }

    public String getCourse2Reference(){
        return course2Reference;
    }

    public String getAuthor2Reference(){
        return author2Reference;
    }

    public String getFooterLogoReference(){
        return footerLogoReference;
    }

    public String getPlaceholderIconReference(){
        return placeholderIconReference;
    }

    public String getPhoneIconReference(){
        return phoneIconReference;
    }

    public String getEmailIconReference(){
        return emailIconReference;
    }



    public String getHome(){
        return home;
    }
    public boolean getHomeCheckbox(){
        return homeCheckbox;
    }

    public String getAbout(){
        return about;
    }
    public boolean getAboutCheckbox(){
        return aboutCheckbox;
    }

    public String getCourses(){
        return courses;
    }
    public boolean getCoursesCheckbox(){
        return coursesCheckbox;
    }

    public String getElements(){
        return elements;
    }
    public boolean getElementsCheckbox(){
        return elementsCheckbox;
    }

    public String getNews(){
        return news;
    }
    public boolean getNewsCheckbox(){
        return newsCheckbox;
    }

    public String getContact(){
        return contact;
    }
    public boolean getContactCheckbox(){
        return contactCheckbox;
    }

    public String getMenuHome(){
        return menuHome;
    }
    public boolean getMenuHomeCheckbox(){
        return menuHomeCheckbox;
    }

    public String getMenuAbout(){
        return menuAbout;
    }
    public boolean getMenuAboutCheckbox(){
        return menuAboutCheckbox;
    }

    public String getMenuCourses(){
        return menuCourses;
    }
    public boolean getMenuCoursesCheckbox(){
        return menuCoursesCheckbox;
    }

    public String getMenuElements(){
        return menuElements;
    }
    public boolean getMenuElementsCheckbox(){
        return menuElementsCheckbox;
    }

    public String getMenuNews(){
        return menuNews;
    }
    public boolean getMenuNewsCheckbox(){
        return menuNewsCheckbox;
    }

    public String getMenuContact(){
        return menuContact;
    }
    public boolean getMenuContactCheckbox(){
        return menuContactCheckbox;
    }

    public String getPinterest(){
        return pinterest;
    }
    public boolean getPinterestCheckbox(){
        return pinterestCheckbox;
    }

    public String getLinkedin(){
        return linkedin;
    }
    public boolean getLinkedinCheckbox(){
        return linkedinCheckbox;
    }

    public String getInstagram(){
        return instagram;
    }
    public boolean getInstagramCheckbox(){
        return instagramCheckbox;
    }

    public String getFacebook(){
        return facebook;
    }
    public boolean getFacebookCheckbox(){
        return facebookCheckbox;
    }

    public String getTwitter(){
        return twitter;
    }
    public boolean getTwitterCheckbox(){
        return twitterCheckbox;
    }

    public String getCourse1(){
        return course1;
    }
    public boolean getCourse1Checkbox(){
        return course1Checkbox;
    }

    public String getCourse2(){
        return course2;
    }
    public boolean getCourse2Checkbox(){
        return course2Checkbox;
    }

    public String getFooterHome(){
        return footerHome;
    }
    public boolean getFooterHomeCheckbox(){
        return footerHomeCheckbox;
    }

    public String getFooterAbout(){
        return footerAbout;
    }
    public boolean getFooterAboutCheckbox(){
        return footerAboutCheckbox;
    }

    public String getFooterCourses(){
        return footerCourses;
    }
    public boolean getFooterCoursesCheckbox(){
        return footerCoursesCheckbox;
    }

    public String getFooterNews(){
        return footerNews;
    }
    public boolean getFooterNewsCheckbox(){
        return footerNewsCheckbox;
    }

    public String getFooterContact(){
        return footerContact;
    }
    public boolean getFooterContactCheckbox(){
        return footerContactCheckbox;
    }

    public String getTestimonials(){
        return testimonials;
    }
    public boolean getTestimonialsCheckbox(){
        return testimonialsCheckbox;
    }

    public String getFaq(){
        return faq;
    }
    public boolean getFaqCheckbox(){
        return faqCheckbox;
    }

    public String getCommunity(){
        return community;
    }
    public boolean getCommunityCheckbox(){
        return communityCheckbox;
    }

    public String getCampusPictures(){
        return campusPictures;
    }
    public boolean getCampusPicturesCheckbox(){
        return campusPicturesCheckbox;
    }

    public String getTuitions(){
        return tuitions;
    }
    public boolean getTuitionsCheckbox(){
        return tuitionsCheckbox;
    }

    public String getFooterPinterest(){
        return footerPinterest;
    }
    public boolean getFooterPinterestCheckbox(){
        return footerPinterestCheckbox;
    }

    public String getFooterLinkedIn(){
        return footerLinkedIn;
    }
    public boolean getFooterLinkedInCheckbox(){
        return footerLinkedInCheckbox;
    }

    public String getFooterInstagram(){
        return footerInstagram;
    }
    public boolean getFooterInstagramCheckbox(){
        return footerInstagramCheckbox;
    }

    public String getFooterFacebook(){
        return footerFacebook;
    }
    public boolean getFooterFacebookCheckbox(){
        return footerFacebookCheckbox;
    }

    public String getFooterTwitter(){
        return footerTwitter;
    }
    public boolean getFooterTwitterCheckbox(){
        return footerTwitterCheckbox;
    }

}