class TeamMember:
    def __init__(self, name, role):
        self.name = name
        self.role = role
    
    def display_member(self):
        print(f"Name: {self.name}")
        print(f"Role: {self.role}")

class TeamLeader:
    def __init__(self, leader_name, team_name):
        self.leader_name = leader_name
        self.team_name = team_name

    def display_leader(self):
        print(f"Team Leader: {self.leader_name}")
        print(f"Team: {self.team_name}")

class TeamLeaderMember(TeamMember, TeamLeader):
    def __init__(self, name, role, leader_name, team_name):
        TeamMember.__init__(self, name, role)
        TeamLeader.__init__(self, leader_name, team_name)
    
    def display_details(self):
        self.display_member()
        self.display_leader()

if __name__ == "__main__":
    member_leader = TeamLeaderMember("Alice", "Developer", "Bob", "Engineering Team")
    
    member_leader.display_details()
