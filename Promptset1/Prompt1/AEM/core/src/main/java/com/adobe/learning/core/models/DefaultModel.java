package com.adobe.learning.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import javax.inject.Inject;
import java.util.List;
import java.util.Collections;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.commons.collections4.CollectionUtils;

@Model(adaptables = Resource.class)
public class DefaultModel {

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String logoText;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselTitle1;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselDescription1;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselTitle2;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselDescription2;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselTitle3;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselDescription3;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselTitle4;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselDescription4;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselTitle5;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselDescription5;



    @ChildResource(name="mainMenuModel", injectionStrategy = InjectionStrategy.OPTIONAL)
    @Inject
    protected List<MainMenuModel> mainMenuModel;

    @ChildResource(name="dropdownMenuModel", injectionStrategy = InjectionStrategy.OPTIONAL)
    @Inject
    protected List<DropdownMenuModel> dropdownMenuModel;



    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselImage1Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselImage2Reference;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselImage3Reference;



    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselCTA1;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean carouselCTA1Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselCTA2;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean carouselCTA2Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselCTA3;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean carouselCTA3Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselCTA4;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean carouselCTA4Checkbox;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String carouselCTA5;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean carouselCTA5Checkbox;


    public String getLogoText(){
        return logoText;
    }

    public String getCarouselTitle1(){
        return carouselTitle1;
    }

    public String getCarouselDescription1(){
        return carouselDescription1;
    }

    public String getCarouselTitle2(){
        return carouselTitle2;
    }

    public String getCarouselDescription2(){
        return carouselDescription2;
    }

    public String getCarouselTitle3(){
        return carouselTitle3;
    }

    public String getCarouselDescription3(){
        return carouselDescription3;
    }

    public String getCarouselTitle4(){
        return carouselTitle4;
    }

    public String getCarouselDescription4(){
        return carouselDescription4;
    }

    public String getCarouselTitle5(){
        return carouselTitle5;
    }

    public String getCarouselDescription5(){
        return carouselDescription5;
    }


    public List<MainMenuModel> getMainMenuModel() {
        if(CollectionUtils.isEmpty(mainMenuModel)){
            return Collections.emptyList();
        }
        return mainMenuModel;
    }

    public List<DropdownMenuModel> getDropdownMenuModel() {
        if(CollectionUtils.isEmpty(dropdownMenuModel)){
            return Collections.emptyList();
        }
        return dropdownMenuModel;
    }




    public String getCarouselImage1Reference(){
        return carouselImage1Reference;
    }

    public String getCarouselImage2Reference(){
        return carouselImage2Reference;
    }

    public String getCarouselImage3Reference(){
        return carouselImage3Reference;
    }



    public String getCarouselCTA1(){
        return carouselCTA1;
    }
    public boolean getCarouselCTA1Checkbox(){
        return carouselCTA1Checkbox;
    }

    public String getCarouselCTA2(){
        return carouselCTA2;
    }
    public boolean getCarouselCTA2Checkbox(){
        return carouselCTA2Checkbox;
    }

    public String getCarouselCTA3(){
        return carouselCTA3;
    }
    public boolean getCarouselCTA3Checkbox(){
        return carouselCTA3Checkbox;
    }

    public String getCarouselCTA4(){
        return carouselCTA4;
    }
    public boolean getCarouselCTA4Checkbox(){
        return carouselCTA4Checkbox;
    }

    public String getCarouselCTA5(){
        return carouselCTA5;
    }
    public boolean getCarouselCTA5Checkbox(){
        return carouselCTA5Checkbox;
    }

}