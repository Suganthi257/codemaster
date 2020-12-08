package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.codemasters.entity.MemberEducation;

@Service
public class MemberEducationService implements IMemberEducationService  
{
@Override
public List<MemberEducation> findAll()
{
//creating an object of ArrayList
ArrayList<MemberEducation> memberEducation = new ArrayList<>();
//adding providers to the List
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading" , "typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "https://www.youtube.com/watch?v=vKUAFYVg8fc","video"));
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading1" , "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "","text"));
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading2" , "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "https://www.youtube.com/watch?v=vKUAFYVg8fc","video"));
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading3" , "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "","text"));
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading4" , "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "https://www.youtube.com/watch?v=vKUAFYVg8fc","video"));
memberEducation.add(new MemberEducation("15645367","Aetna","Dummy Heading5" , "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took", "https://www.youtube.com/watch?v=vKUAFYVg8fc","video"));
return memberEducation;
}
}
