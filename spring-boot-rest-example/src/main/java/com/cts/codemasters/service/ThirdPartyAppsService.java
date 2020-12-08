package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.codemasters.entity.ThirdPartyAppsList;

@Service
public class ThirdPartyAppsService implements IThirdPartyAppsService  
{
@Override
public List<ThirdPartyAppsList> findAll()
{
//creating an object of ArrayList
ArrayList<ThirdPartyAppsList> appsList = new ArrayList<>();
//adding providers to the List
appsList.add(new ThirdPartyAppsList("15645367","Aetna","My Data My Health" ,"Naveen","Regidtered since: Dec-2020"));
appsList.add(new ThirdPartyAppsList("15645367","Aetna","Virtual Viewer","Snow bound","Regidtered since: Mar-2017"));
appsList.add(new ThirdPartyAppsList("15645367","Aetna","hapi.fhir","Apache","Regidtered since: June-2017"));
appsList.add(new ThirdPartyAppsList("15645367","Aetna","Dummy Heading3","Dummy Owner Name","Regidtered since: Aug-2016"));
appsList.add(new ThirdPartyAppsList("15645367","Aetna","Dummy Heading4","Dummy Owner Name","Regidtered since: Sep-2018"));
appsList.add(new ThirdPartyAppsList("15645367","Aetna","Dummy Heading5","Owner Name","Regidtered since: Oct-2019"));
return appsList;
}
}
