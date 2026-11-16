# Day 30 — Git & GitHub

# Topics learned 
• Git
• Repository
• Commit
• Branch
• Merge
• Pull
• Push
• Pull Request
• .gitignore

# 1. Git

Git is a distributed Version Control System (VCS) used to track changes in source code, maintain project history, and collaborate with other developers.

# 2. Repository

A repository (repo) is a storage location that contains project files and their version history.

Types:

* Local Repository
* Remote Repository

# 3. Commit

A commit is a snapshot of staged changes saved in the local repository.

git add .
git commit -m "Added new feature"

# 4. Branch

A branch is a separate line of development that allows developers to work on different features without affecting the main codebase.

git branch feature-login
git switch feature-login


Create and switch to a new branch:

git switch -c feature-login

# 5. Merge

Merge combines changes from one branch into another.

git switch main
git merge feature-login

# 6. Pull

Git Pull downloads and integrates the latest changes from a remote repository into the current local branch.

git pull origin main

# 7. Push

Git Push uploads local commits to a remote repository such as GitHub.

git push origin main

# 8. Pull Request (PR)

A Pull Request is a request to merge changes from one branch into another on GitHub.
It allows developers to:

* Review code changes.
* Discuss modifications.
* Identify bugs.
* Approve changes before merging.

# 9. .gitignore

.gitignore is a file that specifies which untracked files and folders Git should ignore.

Example:

gitignore
# Java compiled files
*.class

# Maven generated files
target/

# IDE configuration
.idea/
.vscode/

# Log files
*.log

# Environment variables
.env

# 2. Important Git Commands

| Command                     | Description               |
| --------------------------- | ------------------------- |
| `git --version`             | Check Git installation    |
| `git init`                  | Initialize a repository   |
| `git clone URL`             | Clone a remote repository |
| `git status`                | Check repository status   |
| `git add .`                 | Stage all changes         |
| `git commit -m "message"`   | Commit changes            |
| `git log`                   | View commit history       |
| `git branch`                | List branches             |
| `git switch branch-name`    | Switch branches           |
| `git switch -c branch-name` | Create and switch branch  |
| `git merge branch-name`     | Merge branches            |
| `git remote -v`             | View remote repositories  |
| `git push origin main`      | Push changes              |
| `git pull origin main`      | Pull changes              |
| `git fetch`                 | Fetch remote updates      |
| `git diff`                  | View code differences     |

