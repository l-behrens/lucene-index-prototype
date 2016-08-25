package uni.lars.view;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

//import uni.lars.ApplicationNavigator;
import uni.lars.ApplicationNavigator;
import uni.lars.view.MenuDesign;

/**
 * Created by uni on 8/19/16.
 */
@DesignRoot
@AutoGenerated
public class MainView extends HorizontalLayout implements View {

//    private final VerticalLayout root;

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {


    }

    public MainView(){
        addStyleName(ValoTheme.PANEL_BORDERLESS);

        setSizeFull();
        Menu menu = new Menu();
        addComponent(menu);

        ComponentContainer content = new CssLayout();
        addComponent(content);
        content.setSizeFull();
        setExpandRatio(content, 1.0f);

        new ApplicationNavigator(content);
    }
}