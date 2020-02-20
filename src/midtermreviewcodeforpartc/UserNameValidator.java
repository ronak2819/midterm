/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author ronak
 */
public class UserNameValidator extends User
{
    
    Scanner sc = new Scanner(System.in);
    String userName = sc.nextLine();
  
@Override
      public void setName(String username) {
    this.name = username;
    }

}
