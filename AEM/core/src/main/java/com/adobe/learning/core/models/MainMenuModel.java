package com.adobe.learning.core.models;

import lombok.Getter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;



@Getter
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MainMenuModel{
        
    @ValueMapValue(name="homeLink")
    @Inject
    protected String homeLink;

    @ValueMapValue(name="homeLinkCheckbox")
    @Inject
    protected Boolean homeLinkCheckbox;
    
    
    
            
    @ValueMapValue(name="servicesLink")
    @Inject
    protected String servicesLink;

    @ValueMapValue(name="servicesLinkCheckbox")
    @Inject
    protected Boolean servicesLinkCheckbox;
    
    
    
            
    @ValueMapValue(name="portfolioLink")
    @Inject
    protected String portfolioLink;

    @ValueMapValue(name="portfolioLinkCheckbox")
    @Inject
    protected Boolean portfolioLinkCheckbox;
    
    
    
            
    @ValueMapValue(name="teamLink")
    @Inject
    protected String teamLink;

    @ValueMapValue(name="teamLinkCheckbox")
    @Inject
    protected Boolean teamLinkCheckbox;
    
    
    
            
    @ValueMapValue(name="dropdownLink")
    @Inject
    protected String dropdownLink;

    @ValueMapValue(name="dropdownLinkCheckbox")
    @Inject
    protected Boolean dropdownLinkCheckbox;
    
    
    
            
    @ValueMapValue(name="contactLink")
    @Inject
    protected String contactLink;

    @ValueMapValue(name="contactLinkCheckbox")
    @Inject
    protected Boolean contactLinkCheckbox;
    
    
    
    
}



