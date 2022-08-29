package GITNOTLARI;

public class gitNotlar {

/*


    Git notlari
    git add -A
    git commit -m"day09_Ternary"
    git push
    Import from Intellij to Github
    Click -->>
            * VCS
 * Enable Version Control Integration
 * VCS -> commit
 * commit
 * commit
 * VCS -> Git -> remotes
 * VCS -> Git -> push
    git    -> jdk
    github -> ide
    java -version
    git --version
    mvn -version
 ===========================================
    download git
    check git version on command prompt -->> git -version
 =================================
    GiT
    Git is a tool
    Git is like a java, Github is a Intellij -> version control
* Git is distrubuted version control tool
* Git is one of the most popular version control systems and it helps software developing teams manage changes to their source code over time
============================================
    Version Control System:
            - Git
 - Subversion(SVN)
 - Mercurial
 - SVC
    Version Control Providers:
            - Github     => pull request        PR
 - Gerrit     => merge request       MR
 - Gitlab     => merge request       MR
 - BitBucket
 -> master branch => official original source of code
 -> feature branch => copy of master, for safe changes
    forking --> copy project under your project
    Write permission:     - allowed to make changes
    Read-only permission: - allowed to read/download
    Git Commands:
            *Initialize: git init - creates an empty Git repository or re-initialzes an existing one.
    running a git int in an existing repository will not overwrite things that are already there.
- git init                         - initalizes the directory as a git project
- git status                       - shows changes you have made to this project
- git clone      -project url      - "DOwnloads a copy of the project(remote repository) to your local computer" -> initial download a project to your local machine  // -----------  inside powerShell ---------------
- git pull                         - download changes to a project(remote repository)
- git push                         - upload my changes to a project(remote repository)
- git remote add origin projectUrl - link your local /// "copy from gitgub repository"
=======================
        -> Right click on project -> click reveal(mac) / show in explorer(windows)
    Note:
            .gitignore
            .iml
    target/
            .idea/ => configuration files/folder that must not be uploaded to remote repository
==========================
    local repository( our machine)  -> - working directory
                                   - staging area
                                   - local area
    remote repository  -> github,.....
            1) Make some changes in working directory -> Add files to staging area -> Commit
    files from staging area to a local repo -> Push files from local to remote repository
    Code flow to upload changes to remote repo:
    make changes -->git add ->git commit ->git push
    git status -> git add -A --> git
    git add fileName             - adds specific file to a staging area
    git commit -m "my message"   - commits files from staging area with a message to a local repository
    git push --set-upstream origin branchName   -->> create a branch on a remote repository
    git push                     - upload changes to a remote repository
    git stash
    Before push you have to pull:
    Before uploading your changes to a remote repository you have to download the latest code from remote repo.
    steps:
            * git init
* git status
* git add -A  -->>> git all files
* git commit -m""
            * git push   ------>>>> address
* git push --set-upstream origin master
======================================================
    steps:
    git clone
    git add -A
    git commit -m""
    git push
    Once you finish making your changes in Intellij, you should:
            1. git add fileName        => to add your changes to staging
2. git commit -m "message" => to commit your changes
3. git remote add origin https://github.com/FurkanDzgn/Bos.git  -->> provide the destination where push goes
            3. git push                => to upload your changes to remote repository
    git push --set-upstream url master => run this command when try to push for the very FIRST time from current branch
    fatal: remote origin already exists -> if i have same issue -> git remote rm origin -> put this code
    Pull request (PR)
====================git troubleshooting===========
    fatal: not a git repository (or any of the parent directories): .git
    solution:
    git init
    green file --> staging area
    red file   --> local machine
    Second Issue
    fatal: No configured push destination.
    solution:
            1. Create repository
                                 2.Add remote repository:  git remote add origin URL
    Third Issue
    The current branch master has no upstream branch.
    Solution:
            1. git push --set-upstream origin master
    ///git config --global --unset-all/// -->> delete cookies
    git reset fileName -> removes file from staging area
==================
    To let other people push to your repository:
            1. Navigate to the project
2. Go to Settings
3. Click on Manage access
4. Invite a collaborator
    git clone "url"
    open project at intellij
    git init
    git status
    git add -A
    git pull (If master branch change smthig we need to pull before push)
    git push
---------------
    New Branch
    git init
    git status
    git checkout -b iss53
    git commit -m "added a new footer[issue 53]"
    git push
    git push --set-upstream origin iss53
=================
    git branch BranchName      --> create a new branch
    git checkout -b BranchName --> create a new branch and switch this branch
    git branch -->> show your branch
    git checkout branchName  -->> switch the branch
==
    git checkout master
==========================
    git reset -- fileName -> remove from staging area to local machine
    git reset          -> remove from staging area to local machine all files
==========================
        **** Git Commands are inside this website -->> https://dzone.com/articles/top-20-git-commands-with-examples ***
            ============================
    When switch the different branch and create class or whatever(file,...) when you push your branch and your local machine show only at this branch
================================
    $ git add –A
    $ git commit –m "Some commit message"
    $ git checkout master
    Switched to branch 'master'
    $ git merge {name of your branch}
    $ git push
===================
    $ git add –A
    $ git commit –m "Some commit message"
    $ git checkout master
    Switched to branch 'master'
    $ git merge {name of your branch}
===============================
    Choose your branch
    Click Pull request -> click new Pull request -> base(master) <- compare(your branch)
================================================================================================
    Git -> Mentoring
- GUI vs CLI
- Create new repository
- working directory -> staging area -> local repo -> remoto repo
    git init           git add          git commit   git push
    Commands:
            * git config --global user.name "Your name"
            * git config --global user.email "yourname@provider.com"
            * git config --list
 * git reset -- filename // remove from staging area to working directory
 * git log   -->> after git commit -m "message"  //
            * git push -u origin master
 * git remote -v   -->> show me which version of my remoto repo
 * git reflog  -->> show what we have
 * git rm --cached <file name>  -->> if you want to untrack a single file -> dosyayi staging area dan local a geri alir
 * git add .  -> add every file
 * git log -> credentials
 * git log --oneline
 * git reset <idnumber> --hard -> delete everything inside folder
 * git reset <idnumber> --soft -> staging area ya geri aliyor
 * git commit --amend -m "message" -> mesaji bastan duzenler
 * git commit --amend  -> bastan mesaji duzenler (push 'i' and click 'esc' ':' 'wq' )
-------------------------
    Branch
    git branch nameOfBranch -> create a branch
    git branch -a  -> show all branch
    git checkout nameOfBranch -> move this branch
    git checkout -b nameOfBranch -> hangi branch deysen onun ustune dal olusturuyor(branch olusturuyor)
    git branch -d nameOfBranch -> delete branch // If it is not working use -> git branch -D nameOfBranch
    git merge nameOfBranch -> we merge everything with current branch -> bunu yapmadan once birlestirmen gereken branch e ilerle                    sonra hangi branch i master ile birlestirmek istiyorsan onunla birlestir
---------------
    git push origin master
    git remote -v
--------------------
    git fetch origin -> bitbucket an local machine alir ama daha goremeyiz
    git branch -a    -> branch leri gosterir ve stage de aldigimiz dosyalari gosterir
    git merge origin/master -> stage deki dosyalari master a merge eder
    git pull origin master -> directly upload everything to local machine what we changed on bitbucket
----------
    git config --global alias.st status -> git status command convert to git st
-----------
    git checkout -- fileName  -> what we changed on the file we take back (siliyoruz)
    git diff -> we can see what we changed inside the file
-------------------------------
    click->VCS -> enable version control integration
    click-> VCS -> git -> remote -> add link(bitbucket)
    stash changes - unstash changes  -->> we can see What we change and what is the differences between
---------------------
    git log --oneline  -> yaptigimiz degisiklikleri goruyoruz ve id leri goruyoruz
    git add filename
    git commit -m"sff"
    git reset id --> commitledigimiz dosyayi geri aliyoruz| Kullanilmasi gerreken id numarasi commit mesajindan sonraki id  numarasi oluyor
---------------------
    git add filename
    git reset  --> add ledigimiz herseyi geri aliyor
-----------------
    Credentials manager a gidip git username and password can be uptade
----------------
    Create branch at Intellij
    Make change inside created branch
    After push the code created branch
    Inside Github create Pull request from created branch to master branch
    And merge it
    lastly, inside intellij switch to master branch and run git pull and take from what change inside github
© 2022 GitHub, Inc.
            Terms
            Privacy
    Security
            Status
    Docs
    Contact GitHub
    Pricing
            API
    Training
            Blog
    About
    Loading complete

    */





}
